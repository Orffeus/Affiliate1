set wsdluri=http://webservices.interhome.com:8980/partnerV3/WebService.asmx?WSDL
set gensrcdir=.\src
set targetpackage=com.interhome.webservice
set genoutdir=.\war\WEB-INF\classes
wsimport -d "%genoutdir%" -s "%gensrcdir%" -p %targetpackage% -keep "%wsdluri%"