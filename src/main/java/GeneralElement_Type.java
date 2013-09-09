
/* First created by JCasGen Sun Sep 08 23:13:12 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sun Sep 08 23:49:36 EDT 2013
 * @generated */
public class GeneralElement_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneralElement_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneralElement_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneralElement(addr, GeneralElement_Type.this);
  			   GeneralElement_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneralElement(addr, GeneralElement_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneralElement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("GeneralElement");
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "GeneralElement");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "GeneralElement");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_casProcessorID;
  /** @generated */
  final int     casFeatCode_casProcessorID;
  /** @generated */ 
  public String getCasProcessorID(int addr) {
        if (featOkTst && casFeat_casProcessorID == null)
      jcas.throwFeatMissing("casProcessorID", "GeneralElement");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorID);
  }
  /** @generated */    
  public void setCasProcessorID(int addr, String v) {
        if (featOkTst && casFeat_casProcessorID == null)
      jcas.throwFeatMissing("casProcessorID", "GeneralElement");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneralElement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

 
    casFeat_casProcessorID = jcas.getRequiredFeatureDE(casType, "casProcessorID", "uima.cas.String", featOkTst);
    casFeatCode_casProcessorID  = (null == casFeat_casProcessorID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessorID).getCode();

  }
}



    