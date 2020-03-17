<html>
<head>
    <title>Grade Calculator</title>
    <link rel="stylesheet" href="/assets/bootstrap.css">
    <style>
    #calculator-form {
        width: 340px;
        margin: 50px auto;
    }
    </style>
</head>

<body>
<form action="/calculator/calc" id="calculator-form" method="get">

    <tmpl:form_row label="EN" name="en" />
    <tmpl:form_row label="MSP" name="msp" />

    <div class="alert alert-info">
    <webec:decorate grade="${calculatorModel.result}">${calculatorModel.result}</webec:decorate>
    </div>
    <input type="submit" class="btn btn-primary" value="Calculate">
</form>
</body>
</html>
