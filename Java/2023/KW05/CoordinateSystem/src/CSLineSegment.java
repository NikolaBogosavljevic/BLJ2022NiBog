public class CSLineSegment {
    private CSPoint lineStart;
    private CSPoint lineEnd;

    public CSLineSegment(CSPoint lineStart, CSPoint lineEnd){
        this.lineStart = lineStart;
        this.lineEnd = lineEnd;
    }

    public CSPoint getLineStart() {
        return lineStart;
    }

    public CSPoint getLineEnd() {
        return lineEnd;
    }
}
