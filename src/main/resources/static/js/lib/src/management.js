/*


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

*/

//Side Nav
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





    //Content
    var contentBoxes = document.querySelectorAll('.content-box');

    //Links to Open Content
    var contentLinks = document.querySelectorAll('.contentLink');

    function clearContent(){
        for (var i = 0; i < contentBoxes.length; i++) {
            contentBoxes[i].removeClass('selectedContent');
        }
    }

    contentBoxes.addEventListener('click', clearContent);


    function changeContent(){
        if (!this.classList.contains('selectedContent')){
            this.toggleClass('selectedContent');
        }
    };

    for (var i = 0; i < contentLinks.length; i++){
        contentLinks[i].addEventListener('click', changeContent);
    };





//element.classList.contains(class);