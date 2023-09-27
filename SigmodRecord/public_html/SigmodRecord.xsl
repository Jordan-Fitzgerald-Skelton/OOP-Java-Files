<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecord.xsl
    Created on : 13 October 2022, 15:21
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
                <title>SigmodRecordQ1.xsl</title>
            </head>
            <body>
                <h2>All Book Titles</h2>
                <xsl:apply-templates select="/SigmodRecord/issue/articles/article/title"/>
            </body>
        </html>
    </xsl:template>
        <!-- 1. All book titles -->
    <xsl:template match="title">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>

</xsl:stylesheet>
