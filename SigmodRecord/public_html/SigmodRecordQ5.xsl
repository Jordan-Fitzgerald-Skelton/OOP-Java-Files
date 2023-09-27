<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecordQ5.xsl
    Created on : 13 October 2022, 16:13
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
                <title>SigmodRecordQ5.xsl</title>
            </head>
            <body>
                <h2>the name of the second authors of each article</h2>
                <xsl:apply-templates select="SigmodRecord/issue/articles/article/authors/author[@position='01']"/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="author[@position='01']">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>

</xsl:stylesheet>
