package pl.pkrysztofiak.nyx.view.brackethighlighter;

public interface TextInsertionListener {

    void codeInserted(int start, int end, String text);

}
