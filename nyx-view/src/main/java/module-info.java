module nyx.view {
    requires javafx.controls;
    requires javafx.fxml;
    requires flowless;
    requires org.fxmisc.richtext;
    requires reactfx;
    requires wellbehavedfx;
    requires java.desktop;

    opens pl.pkrysztofiak.nyx.view to javafx.fxml;
    opens pl.pkrysztofiak.nyx.view.richtext to javafx.fxml;

    exports pl.pkrysztofiak.nyx.view;
    exports pl.pkrysztofiak.nyx.view.richtext;
    exports pl.pkrysztofiak.nyx.view.lineindicator;
    exports pl.pkrysztofiak.nyx.view.hyperlink;
    exports pl.pkrysztofiak.nyx.view.brackethighlighter;
}