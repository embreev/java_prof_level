/**
 * Created by EVDOKIMOVAL on 30.08.2018.
 */
$(document).ready(function() {
    $('#btnWelcome').click(function (e) {
        console.log('Hello');
    });
    $('#btnWelcome').toggleClass( "btn btn-primary" )


    $('#btnHello').click(function (e) {
        $.post("/about/test_param", {
            name_param: $('#newTestParam').val()
        }).done(function (result) {
            location.reload();
        });
    });

    $('#btnPrint').click(function (e) {
        $.post("/test/print_console", {
            name_param: $('#newTest').val()
        }).done(function (result) {
            location.reload();
        });
    });


});