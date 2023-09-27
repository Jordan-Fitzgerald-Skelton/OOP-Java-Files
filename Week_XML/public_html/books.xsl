<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : books.xsl
    Created on : 11 October 2022, 13:35
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
                <title>books.xsl</title>
            </head>
            <body>
                <h2>All Book Titles</h2>
                <xsl:apply-templates select="catalog/book/title"/>
                <h2>Out of Print Titles:</h2>
                <xsl:apply-templates select="/catalog/book/outOfPrint"/>
                <h2>All Fantasy book id’s</h2>
                <xsl:apply-templates select="/catalog/book/genre[contains(string(), 'Fantasy')]"/>
                <h2>All Books published after 2001</h2>
                <xsl:apply-templates select="catalog/book[publish[publish_date>'2001']]"/>
                <h2>All Books witch a price greater than 30</h2>
                <xsl:apply-templates select="/catalog/book[price>'30']"/>       
            </body>
        </html>
    </xsl:template>
    <!-- 1. All book titles -->
    <xsl:template match="title">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>
    <!-- 2. All out of print titles -->
    <xsl:template match="outOfPrint">
        <p>
            <xsl:value-of select="../title"/>
        </p>
    </xsl:template>
    <!-- 3. Fantasy book id numbers -->
    <xsl:template match="genre">
        <p>
            <xsl:value-of select="../@id"/>
        </p>
    </xsl:template>
    <!-- 4. Published after 2001 -->
    <xsl:template match="book">
        <p>
            <xsl:value-of select="title"/>
        </p>
    </xsl:template>
    <!-- 5. Books costing more than 30 -->
    <xsl:template match="book[price>'30']">
        <p>
            <xsl:value-of select="title"/>
            ,
            <xsl:value-of select="price"/>
        </p>
    </xsl:template>
</xsl:stylesheet>