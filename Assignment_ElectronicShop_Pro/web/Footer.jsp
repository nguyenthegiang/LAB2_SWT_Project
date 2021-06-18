<%-- 
    Document   : Footer
    Created on : Mar 2, 2021, 3:28:20 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computer ERA</title>
    </head>
    <body>
        <!-- Footer -->
        <footer class="text-light">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-lg-4 col-xl-3">
                        <h5>About</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <p class="mb-0">
                            ${infor.description}
                        </p>
                    </div>

                    <div class="col-md-4 col-lg-3 col-xl-3">
                        <h5>Contact</h5>
                        <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                        <ul class="list-unstyled">
                            <li><i class="fa fa-home mr-2"></i> ${infor.address}</li>
                            <li><i class="fa fa-envelope mr-2"></i> ${infor.email}</li>
                            <li><i class="fa fa-phone mr-2"></i> + ${infor.phone}</li>
                            <li><i class="fa fa-print mr-2"></i> + ${infor.fax}</li>
                        </ul>
                    </div>

                    <div class="col-md-4 col-lg-3 col-xl-3">
                        <h6>GPĐKKD số 0101161194 do Sở KHĐT Tp.Hà Nội cấp ngày 31/8/2001</h6>
                        <a href="http://www.online.gov.vn/Home/WebDetails/5016" target="blank">
                            <img src="image/dathongbao.png" alt="Đăng ký bộ công thương">
                        </a>
                    </div>

                    <div class="col-md-4 col-lg-3 col-xl-3">
                        <a href="#">Back to top</a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
