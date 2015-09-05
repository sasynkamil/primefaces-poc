function openWindowJS(url, windowName) {
    var newWindow = window.open(url, windowName, "resizable=yes,titlebar=no,menubar=no,location=no,status=no,toolbar=no");
    newWindow.moveTo(0, 0);
    newWindow.resizeTo(screen.width - (screen.width / 10), screen.height - (screen.height / 12));
}

function isLayoutOpen() {
    var isLayoutOpen = window.sessionStorage.getItem('isLayoutOpen');
    if (isLayoutOpen == null) {
        isLayoutOpen = 'true';
        window.sessionStorage.setItem('isLayoutOpen', isLayoutOpen);
    }
    return isLayoutOpen;
}

function toggleAllPanesJS() {
    if (isLayoutOpen() == 'true') {
        window.sessionStorage.setItem('isLayoutOpen', false);
        PF('layoutWidget').close('north');
        PF('layoutWidget').close('center_center_west');
        PF('layoutWidget').close('center_center_east');

    } else {
        window.sessionStorage.setItem('isLayoutOpen', true);
        PF('layoutWidget').open('north');
        PF('layoutWidget').open('center_center_west');
    }
}
