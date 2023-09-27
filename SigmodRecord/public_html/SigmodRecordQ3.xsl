<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecordQ3.xsl
    Created on : 13 October 2022, 15:31
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
                <title>SigmodRecordQ3.xsl</title>
            </head>
            <body>
                <h2>Questions 3</h2>
                <xsl:apply-templates select="//article[initPage > 30 and initPage < 35]"/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="article">
        <h3>
            <xsl:value-of select="title"/>
        </h3>
        <xsl:apply-templates select=".//author"/>
    </xsl:template>
    <xsl:template match="author">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>

</xsl:stylesheet>
