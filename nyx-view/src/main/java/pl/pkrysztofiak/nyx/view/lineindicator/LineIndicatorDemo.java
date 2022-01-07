package pl.pkrysztofiak.nyx.view.lineindicator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyledTextArea;

import java.util.function.IntFunction;

/**
 * Demonstrates the usage of {@link StyledTextArea#paragraphGraphicFactoryProperty()}.
 */
public class LineIndicatorDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CodeArea codeArea = new CodeArea();

        IntFunction<Node> numberFactory = LineNumberFactory.get(codeArea);
        IntFunction<Node> arrowFactory = new ArrowFactory(codeArea.currentParagraphProperty());
        IntFunction<Node> graphicFactory = line -> {
            HBox hbox = new HBox(
                    numberFactory.apply(line),
                    arrowFactory.apply(line));
            hbox.setAlignment(Pos.CENTER_LEFT);
            return hbox;
        };
        codeArea.setParagraphGraphicFactory(graphicFactory);
        codeArea.replaceText("The green arrow will only be on the line where the caret appears.\n\nTry it.");
        codeArea.moveTo(0, 0);

        primaryStage.setScene(new Scene(new StackPane(codeArea), 600, 400));
        primaryStage.show();
    }
}
