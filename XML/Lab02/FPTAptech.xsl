<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>FPTAptech</title>
            </head>
            <body>
                <h1>FPT Aptech Students</h1>
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<th>Fist Name</th>
				<th>Last Name</th>
                                <th>Sex</th>
				<th>Age</th>
			</tr>
			<xsl:for-each select="FPTAptech/Student">
			<xsl:if test="@Sex[. = 'Female' or . = 'Male'] and Age[. &gt;= 14] ">
                                <tr>
					<td><xsl:value-of select="Name/FName"/></td>
					<td><xsl:value-of select="Name/LName"/></td>
                                        <td><xsl:value-of select="@Sex"/></td>
					<td><xsl:value-of select="Age"/></td>
				</tr>
			</xsl:if>		
			</xsl:for-each>
		</table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
