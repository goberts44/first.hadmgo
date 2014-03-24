package first.hadmgo;

import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.log4j.Logger;



public class UT {

	private static final Logger LOG = Logger.getLogger(UT.class);

	private static UT INSTANCE;

	public final Properties PROPERTIES = null;

	private SimpleDateFormat sdf;

	public static final String MAP_DELIMITER_0 = "\t";
	public static final String MAP_DELIMITER_1 = "=";
	public static final String MAP_DELIMITER_2 = ",";

	public static UT get() {
		if (null == INSTANCE) {
			INSTANCE = new UT();
			INSTANCE.doRegistration();
		}
		return INSTANCE;
	}

	public UT() {
		super();
	}

	@SuppressWarnings("all")
	private void doRegistration() {
//		LOG.debug("doRegistration==>");
//		ScenarioPackage pkgScenario = ScenarioPackage.eINSTANCE;
//		DiseasePackage pkgDisease = DiseasePackage.eINSTANCE;
//		EpistatePackage pkgEpistate = EpistatePackage.eINSTANCE;
//		IostatePackage pkgIostate = IostatePackage.eINSTANCE;
//		LocationPackage pkgLocation = LocationPackage.eINSTANCE;
////		TransportPackage pkgTransport = TransportPackage.eINSTANCE;
//		ConfPackage pkgConfiguration = ConfPackage.eINSTANCE;
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",
//				new XMIResourceFactoryImpl());
//		LOG.debug("<==doRegistration");
	}

	private SimpleDateFormat getSDF() {
		if (sdf == null) {
			sdf = new SimpleDateFormat(F.DATE_FORMAT);
		}
		return sdf;
	}
}
