<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SigmodRecordQ2.xsl
    Created on : 13 October 2022, 15:26
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
                <title>SigmodRecordQ2.xsl</title>
            </head>
            <body>
                <xsl:apply-templates select="SigmodRecord/issue[contains(string(), '25')]"/>
            </body>
        </html>
    </xsl:template>
    <xsl:template match="issue[contains(string(), '25')]">
        <p>
            <xsl:value-of select="../issue/articles/article/title"/>
        </p>
    </xsl:template>

</xsl:stylesheet>
