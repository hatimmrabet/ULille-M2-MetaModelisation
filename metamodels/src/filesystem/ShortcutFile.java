/**
 */
package filesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortcut File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.ShortcutFile#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see filesystem.FilesystemPackage#getShortcutFile()
 * @model
 * @generated
 */
public interface ShortcutFile extends File {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see filesystem.FilesystemPackage#getShortcutFile_File()
	 * @model
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link filesystem.ShortcutFile#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // ShortcutFile
