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
<form method="post" action="/khach-hang/add">
    <div class="mb-3">
        <label  class="form-label">Tên khách hàng</label>
        <input type="text" class="form-control" name="tenKhachHang">
    </div>
    <div class="mb-3">
        <label  class="form-label">Số điện thoại</label>
        <input type="text" class="form-control" name="soDienThoai">
    </div>
    <div class="mb-3">
        <label  class="form-label">Mã hạng</label>
        <select class="form-select" aria-label="Default select example" name="hangKhachHang">
            <c:forEach items="${listKhachHang}" var="k">
                <option value="${k.maHang}" >${k.tenHang} </option>
            </c:forEach>
        </select>
    </div>
    <div class="mb-3">
        <label  class="form-label">Giới tính</label>
        <div class="form-check">
            <input class="form-check-input" value="true" type="radio" name="gioiTinh" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
                Nam
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" value="false" type="radio" name="gioiTinh" id="flexRadioDefault2" checked>
            <label class="form-check-label" for="flexRadioDefault2">
                Nữ
            </label>
        </div>
    </div>
    <button type="submit">Add</button>

</form>

<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Handle</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="kh">
        <tr>
            <th scope="row">${kh.maKhachHang}</th>
            <td>${kh.tenKhachHang}</td>
            <td>${kh.soDienThoai}</td>
            <td>${kh.hangKhachHang.maHang}</td>
            <td>${kh.gioiTinh == true ? "Nam": "Nữ"}</td>
            <td>
                <a href="/khach-hang/delete/${kh.maKhachHang}">Xóa</a>
                <a href="/khach-hang/update/${kh.maKhachHang}">Sua</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<nav aria-label="Page navigation example">
    <ul class="pagination">
    <c:forEach begin="1" end="${totalPage}" varStatus="status">
        <li class="page-item"><a class="page-link" href="/khach-hang/hien-thi?pageNum=${status.index}">${status.index}</a></li>
    </c:forEach>
    </ul>
</nav>
</body>
</html>