package EntradaSalida;

import java.nio.file.Path;

public class ClassPath {

	public static void main(String[] args) {
		Path dir = Path.of("..\\EntradaSalida").toAbsolutePath().normalize();
		System.out.println("getFileName: "+ dir.getFileName());
		System.out.println("getName: "+ dir.getName(1));
		System.out.println("getName: "+ dir.getName(0));
		System.out.println("getNameCount: "+ dir.getNameCount());
		System.out.println("getRoot: "+ dir.getRoot());
		System.out.println("getFileSystem: "+ dir.getFileSystem());
		System.out.println("normalize: "+ dir.normalize());
		System.out.println("getParent: "+ dir.getParent());
	}
}
