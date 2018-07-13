<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<table>
    <tr>

 <g:each in="${numberMapOne.take(10)}" var="item">
    <td>${item.key} : ${item.value}</td>
</g:each>

    </tr>
    <tr>

<g:each in="${numberMapTwo.take(10)}" var="item">
    <td>${item.key} : ${item.value}</td>
</g:each>
    </tr>


    <g:each in="${numberMapThree.take(10)}" var="item">
        <td>${item.key} : ${item.value}</td>
    </g:each>
</tr>

    <g:each in="${numberMapFour.take(10)}" var="item">
        <td>${item.key} : ${item.value}</td>
    </g:each>
</tr>

    <g:each in="${numberMapFive.take(10)}" var="item">
        <td>${item.key} : ${item.value}</td>
    </g:each>
</tr>

</table>
</body>