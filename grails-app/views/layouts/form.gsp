<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>
        <g:layoutTitle default="Form"/>
    </title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
    <style>
    footer {
        display: block;
        width: 100%;
        background-color: lightgray;
        position: fixed;
        bottom: 0px;
        left: 0px;
        text-align: center;
    }
    </style>

    <g:layoutHead/>
</head>

<body>

<h1 style="text-align:center;"><g:layoutTitle default="Form"/></h1>

<g:layoutBody/>

<g:if test="${grails.util.Environment.current == grails.util.Environment.DEVELOPMENT}">
    <footer>
        App version:
        <g:meta name="info.app.version"/>
        Grails version:
        <g:meta name="info.app.grailsVersion"/>
        Groovy version:
        ${GroovySystem.getVersion()}
        JVM version:
        ${System.getProperty('java.version')}
        Reloading:
        ${grails.util.Environment.reloadingAgentEnabled}
    </footer>
</g:if>
</body>
</html>
