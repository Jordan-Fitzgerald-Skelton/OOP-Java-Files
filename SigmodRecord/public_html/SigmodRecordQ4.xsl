<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecordQ4.xsl
    Created on : 13 October 2022, 16:06
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
                <title>SigmodRecordQ4.xsl</title>
            </head>
            <body>
                <h2>the name of the first authors of each article</h2>
                <xsl:apply-templates select="SigmodRecord/issue/articles/article/authors/author[@position='00']"/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="author[@position='00']">
        <p>
            <xsl:value-of select="."/>
        </p>
    </xsl:template>

</xsl:stylesheet>
