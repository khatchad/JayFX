package ca.mcgill.cs.swevo.jayfx.util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

public class LogUtil {

	
	private LogUtil() {
	}

	/**
	 * Standard logging behavior
	 */
	public static void log(final String pMessage) {
		System.out.println(pMessage);
	}

	public static void logInfo(String message) {
		logInfo(message, null);
	}

	public static void logWarning(String message) {
		logWarning(message, null);
	}

	public static void logInfo(String message, Throwable e) {
		log(IStatus.INFO, message, e);
	}

	public static void logWarning(String message, Throwable e) {
		log(IStatus.WARNING, message, e);
	}

	public static void logError(String message, Throwable e) {
		log(IStatus.ERROR, message, e);
	}

	public static void log(int severity, String message, Throwable e) {
		Bundle bundle = Platform.getBundle("ca.mcgill.cs.swevo.jayfx");
		ILog log = Platform.getLog(bundle);
		String symbolicName = bundle.getSymbolicName();

		Status status;
	
		if (e == null)
			status = new Status(severity, symbolicName, message);
		else
			status = new Status(severity, symbolicName, message, e);
	
		log.log(status);
	}
}
