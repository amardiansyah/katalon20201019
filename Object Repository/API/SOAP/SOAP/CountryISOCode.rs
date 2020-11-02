<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CountryISOCode</name>
   <tag></tag>
   <elementGuidId>9b16af5f-0ff3-482a-93c7-ebab7ac8cb7f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value></value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
   </httpHeaderProperties>
   <katalonVersion>7.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:web=&quot;http://www.oorsprong.org/websamples.countryinfo&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;web:CountryISOCode>
         &lt;web:sCountryName>gero et&lt;/web:sCountryName>
      &lt;/web:CountryISOCode>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso</soapServiceEndpoint>
   <soapServiceFunction>CountryISOCode</soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <wsdlAddress>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL</wsdlAddress>
</WebServiceRequestEntity>
