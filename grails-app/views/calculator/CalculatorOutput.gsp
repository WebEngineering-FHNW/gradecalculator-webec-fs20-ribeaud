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
    <div class="form-group">
        <label for="en">
            EN
        </label>
        <input class="form-control" type="number" id="en" name="en" value="${calculatorModel.en}">
    </div>

    <div class="form-group">
        <label for="msp">
            MSP
        </label>
        <input class="form-control" type="number" id="msp" name="msp" value="${calculatorModel.msp}">
    </div>
    <div class="alert alert-info">
        ${calculatorModel.result}
    </div>
    <input type="submit" class="btn btn-primary" value="Calculate">
</form>
</body>
</html>
