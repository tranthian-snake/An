<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : SalesData_stylesheet.xsl
    Created on : April 19, 2020, 3:27 PM
    Author     : Tran Thi An
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/CottonDesk">
        <html>
            <head/>
            <body>
                <xsl:for-each select="SalesPerson">
                <p>
                    <font color="black">
                    <xsl:if test="Sales[. &lt;20000]">
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Your Commision is $ </xsl:text>
                    <xsl:text>0</xsl:text>
                    </xsl:if>
                    </font>
                </p>
                <p>
                    <font color="red">
                    <xsl:if test="Sales[. &gt;=20000 and . &lt;30000 ]">
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Your Commision is $ </xsl:text>
                    <xsl:text>500</xsl:text>
                    </xsl:if>
                    </font>
                </p>
                <p>
                    <font color="blue">
                    <xsl:if test="Sales[. &gt;=30000]">
                    <xsl:text>NAME: </xsl:text>
                    <xsl:value-of select="Name"/>
                    <xsl:text> AGE: </xsl:text>
                    <xsl:value-of select="Age"/>
                    <xsl:text> Your Commision is $ </xsl:text>
                    <xsl:text>5000</xsl:text>
                    </xsl:if>
                    </font>
                </p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
