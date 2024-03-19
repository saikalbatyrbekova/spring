<!DOCTYPE html>
<html>
<head>
    <title>Bags US/EU</title>
</head>
<body>
<h1>Bags US/EU - Michael Kors</h1>
<h4>Luxuary Brands' bags, purses, shoes from United States and Europe</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} $ | <a href="/product/${product.id}">More...</a> </p>
    </div>
</#list>
<hr>
<h3>Create a new product</h3>
<form action="/product/create" method="post">
    Name of a product: <input type="text" name="title"><br><br>
    Description of a product: <input type="text" name="description"><br><br>
    Price: <input type="number" name="price"><br><br>
    City: <input type="text" name="city"><br><br>
    Name: <input type="text" name="author"><br><br>
    <input type="submit" value="Add a product">
</form>
</body>
</html>