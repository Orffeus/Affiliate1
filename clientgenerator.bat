set wsdluri=https://webservices.interhome.com:1084/partnerV3/WebService.asmx?WSDL
set gensrcdir=.\src
set targetpackage=com.interhome.webservice
set genoutdir=.\war\WEB-INF\classes
"C:\Program Files\Java\jdk1.6.0_17\bin\wsimport.exe" -d "%genoutdir%" -s "%gensrcdir%" -p %targetpackage% -keep "%wsdluri%"