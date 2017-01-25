/**
 */
package crystal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crystal.Select#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see crystal.CrystalPackage#getSelect()
 * @model annotation="gmf.node figure='rectangle'"
 * @generated
 */
public interface Select extends SQLOperations {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * The default value is <code>"Select"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see crystal.CrystalPackage#getSelect_ClassName()
	 * @model default="Select"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link crystal.Select#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // Select
