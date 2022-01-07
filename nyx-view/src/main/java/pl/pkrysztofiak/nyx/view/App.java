package pl.pkrysztofiak.nyx.view;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;

import java.util.function.IntFunction;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        CodeArea codeArea = new CodeArea();
        codeArea.setParagraphGraphicFactory(new IntFunction<Node>() {
            @Override
            public Node apply(int value) {
                return new Label("Line " + value);
            }
        });
        codeArea.replaceText(0, 0, "Hello, world!");
        stage.setScene(new Scene(new StackPane(new VirtualizedScrollPane<>(codeArea)), 400, 400));
        stage.show();
    }
}
