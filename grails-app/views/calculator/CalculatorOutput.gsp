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
        <input class="form-control" type="number" id="en"
               min="1" max="6" name="en" value="${calculatorModel.en}" required>
    </div>

    <div class="form-group">
        <label for="msp">
            MSP
        </label>
        <input class="form-control" type="number" id="msp"
               min="1" max="6" name="msp" value="${calculatorModel.msp}" required>
    </div>

    <div class="alert alert-info">
        ${calculatorModel.result}
    </div>
    <input type="submit" class="btn btn-primary" value="Calculate">
</form>
</body>
</html>
