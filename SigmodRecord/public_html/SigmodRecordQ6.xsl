<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecordQ6.xsl
    Created on : 13 October 2022, 16:15
    Author     : Jordan
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>SigmodRecordQ6.xsl</title>
            </head>
            <body>
                <xsl:for-each select="//issue">
                    <xsl:sort select="volume"/>
                    <xsl:sort select="number"/>
                    <xsl:element name="h3">
                        <xsl:text>Volume </xsl:text>
                        <xsl:value-of select="volume"/>
                        <xsl:text>, Number </xsl:text>
                        <xsl:value-of select="number"/>
                    </xsl:element>
                    <xsl:apply-templates select="articles/article"/>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="article">
        <xsl:element name="p">
            <xsl:apply-templates select="authors"/>
            <xsl:element name="b">
                <xsl:text> </xsl:text>
                <xsl:value-of select="title"/>
            </xsl:element>
            <xsl:text> pp. </xsl:text>
            <xsl:value-of select="initPage"/>
            <xsl:text>-</xsl:text>
            <xsl:value-of select="endPage"/>
        </xsl:element>
    </xsl:template>
    <xsl:template match="authors">
        <xsl:for-each select="author">
            <xsl:sort select="@position"/>
            <xsl:value-of select="."/>
            <xsl:choose>
                <xsl:when test="position() != last()">
                    <xsl:text>, </xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text> </xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>

