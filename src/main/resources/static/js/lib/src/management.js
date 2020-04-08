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
let contentBoxes = document.querySelectorAll('.content-box');

//Links to Open Content
let contentLinks = document.querySelectorAll('.contentLink');

//Swaps the displayed content
$(contentLinks).ready(function (){
    for (let i = 0; i < contentLinks.length; i++) {
        $(contentLinks[i]).on('click', function() {
            for(let box = 0; box < contentBoxes.length; box++) {
                $(contentBoxes[box]).removeClass('selectedContent');
                $(contentLinks[box]).parent().removeClass('activeContent');
            }
            $(contentBoxes[i]).toggleClass('selectedContent');
            $(contentLinks[i]).parent().toggleClass('activeContent');
        });
    }
});

console.log(contentBoxes);
console.log(contentLinks);

//element.classList.contains(class);