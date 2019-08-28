package base.tryCatch;

public class TryCatchTest {


	public static void main(String[] args) {

		TryCatchTest.test();
	}

	public static boolean test() {
		boolean jude = false;
		try {
			System.out.println("11");
			jude = true;
			return jude;
		} catch (Exception e) {
			System.out.println("catch exception:"+e);
		} finally {
			System.out.println("finally:" + jude);
		}
		System.out.println("jude");
		return jude;
	}
}
