

/* First created by JCasGen Sun Sep 08 23:13:12 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Sep 08 23:49:36 EDT 2013
 * XML source: D:/Eclipse_Workspace/hw1-mengday/src/main/resources/hw1-mengday-typesystem.xml
 * @generated */
public class GeneralElement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneralElement.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneralElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneralElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneralElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneralElement(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (GeneralElement_Type.featOkTst && ((GeneralElement_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "GeneralElement");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((GeneralElement_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (GeneralElement_Type.featOkTst && ((GeneralElement_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "GeneralElement");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((GeneralElement_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: casProcessorID

  /** getter for casProcessorID - gets 
   * @generated */
  public String getCasProcessorID() {
    if (GeneralElement_Type.featOkTst && ((GeneralElement_Type)jcasType).casFeat_casProcessorID == null)
      jcasType.jcas.throwFeatMissing("casProcessorID", "GeneralElement");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneralElement_Type)jcasType).casFeatCode_casProcessorID);}
    
  /** setter for casProcessorID - sets  
   * @generated */
  public void setCasProcessorID(String v) {
    if (GeneralElement_Type.featOkTst && ((GeneralElement_Type)jcasType).casFeat_casProcessorID == null)
      jcasType.jcas.throwFeatMissing("casProcessorID", "GeneralElement");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneralElement_Type)jcasType).casFeatCode_casProcessorID, v);}    
  }

    