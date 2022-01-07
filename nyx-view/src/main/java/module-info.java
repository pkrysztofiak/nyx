module nyx.view {
    requires javafx.controls;
    requires javafx.fxml;
    requires flowless;
    requires org.fxmisc.richtext;

    opens pl.pkrysztofiak.nyx.view to javafx.fxml;

    exports pl.pkrysztofiak.nyx.view;
}