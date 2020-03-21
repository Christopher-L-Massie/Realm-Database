$(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#account-management-sidebar').toggleClass('active');
                $('#sidebarCollapse').toggleClass('activeIcon');
                $('#sidebarExpand').toggleClass('activeIcon');
            });
        });
        $(document).ready(function () {
            $('#sidebarExpand').on('click', function() {
                $('#account-management-sidebar').toggleClass('active');
                $('#sidebarCollapse').toggleClass('activeIcon');
                $('#sidebarExpand').toggleClass('activeIcon');
            });
        });

        $(document).ready(function () {
            $('#selected-notification-settings').on('click', function() {
                $('#content-notification-settings').toggleClass('selectedContent');
                $('#content-password-settings').removeClass('selectedContent');
            });
        });

        $(document).ready(function () {
            $('#selected-password-settings').on('click', function() {
                $('#content-password-settings').toggleClass('selectedContent');
                $('#content-notification-settings').removeClass('selectedContent');
            });
        });