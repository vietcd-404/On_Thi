<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body class="container">
<form method="post" action="/khach-hang/update/${list.maKhachHang}">
    <div class="mb-3">
        <label class="form-label">Tên khách hàng</label>
        <input type="text" value="${list.tenKhachHang}" class="form-control" name="tenKhachHang">
    </div>
    <div class="mb-3">
        <label class="form-label">Số điện thoại</label>
        <input type="text" value="${list.soDienThoai}" class="form-control" name="soDienThoai">
    </div>
    <div class="mb-3">
        <label class="form-label">Mã hạng</label>
        <select class="form-select" aria-label="Default select example" name="hangKhachHang">
            <c:forEach items="${listKhachHang}" var="k">
                <option value="${k.maHang}"  ${list.hangKhachHang.tenHang == k.tenHang ? "selected" : ""} >${k.tenHang} </option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label class="form-label">Giới tính</label>
        <div class="form-check">
            <input class="form-check-input" ${list.gioiTinh == true ?"checked" : ""} value="true" type="radio"
                   name="gioiTinh" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
                Nam
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" ${list.gioiTinh == false ?"checked" : ""} value="false" type="radio"
                   name="gioiTinh" id="flexRadioDefault2">
            <label class="form-check-label" for="flexRadioDefault2">
                Nữ
            </label>
        </div>
    </div>
    <button type="submit">Sua</button>
</form>

</body>
</html>