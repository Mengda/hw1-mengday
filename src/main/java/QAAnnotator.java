import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QAAnnotator extends JCasAnnotator_ImplBase {

  private Pattern mLine = 
          Pattern.compile(".+");
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
      String text = aJCas.getDocumentText();
      Matcher matcher = mLine.matcher(text);
      int pos = 0;
      //while(matcher.find(pos)){
          Answer annotation = new Answer(aJCas);
          annotation.setBegin(0);
          annotation.setEnd(5);
          annotation.setIsCorrect(true);
          annotation.setCasProcessorID(this.getClass().getName());
          annotation.setConfidence(1);
          annotation.addToIndexes();
          
          annotation = new Answer(aJCas);
          annotation.setBegin(6);
          annotation.setEnd(15);
          annotation.setIsCorrect(true);
          annotation.setCasProcessorID(this.getClass().getName());
          annotation.setConfidence(1);
          annotation.addToIndexes();
     // }
  }

}
