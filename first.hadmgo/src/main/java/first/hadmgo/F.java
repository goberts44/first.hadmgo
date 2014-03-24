package first.hadmgo;


public abstract class F {
	
	public static final String DELIMITER = "\t";
	public static final String DEFAULT_GLOBBER = "/part-*";
	public static final String YMD_HMS_DELIMITER = " ";
	public static final String YMD_DELIMITER = "-";
	public static final String HMS_DELIMITER = ":";
	public static final String DT_SPLITTER = YMD_DELIMITER + "|" + YMD_HMS_DELIMITER + "|" + HMS_DELIMITER;
	public static final String CALENDAR_FORMATTER = "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS";
	public static final String TWO_DIGIT_FORMATTER = "%02d";
	public static final String PATH_PROPERTY = "path-property";
	
	public static final String APPLICATION_HOME = "/home/sim/biomobility";
	public static final String SCENARIO_DIR = APPLICATION_HOME;
	public static final String RESOURCE_DIR = APPLICATION_HOME + "/resources";
		
	public static final String HDFS_HOME = "/hdfs";
	public static final String RAW_DIR = HDFS_HOME + "/rawdata";
	public static final String SOURCE_DIR = HDFS_HOME + "/sourcedata";
	public static final String SLIM_DIR = SOURCE_DIR + "/slim";
	public static final String ROUND_DIR = SOURCE_DIR + "/round";
	public static final String PRIME_DIR = SOURCE_DIR + "/prime";
	public static final String COUNT_DIR = SOURCE_DIR + "/count";
	public static final String SPLIT_DIR = SOURCE_DIR + "/split";
	public static final String PROGRESS_DIR = SOURCE_DIR + "/progress";
	public static final String CONTACT_DIR = SOURCE_DIR + "/contact";
	public static final String DEPART_DIR = SOURCE_DIR + "/depart";
	public static final String CONSOLIDATION_DIR = SOURCE_DIR + "/consolidate";
	public static final String SPREAD_DIR = SOURCE_DIR + "/spread";
	public static final String LOCALE_DIR = SOURCE_DIR + "/locale";
	public static final String VALIDATION_DIR = SOURCE_DIR + "/validation";
	
	public static enum ORIG {ID, ARRIVAL_TIME, DEPARTURE_TIME, ARRIVAL_TRANSPORT, DEPARTURE_TRANSPORT, ARRIVAL_ZCTA, DEPARTURE_ZCTA, ARRIVAL_LOCALE, DEPARTURE_LOCALE
, ARRIVAL_LAT, ARRIVAL_LON, DEPARTURE_LAT, DEPARTURE_LON, ARRIVAL_AIRPORT_CODE, DEPARTURE_AIRPORT_CODE, ARRIVAL_MODE, DEPARTURE_MODE
	};
		
	public static enum SLIM {ID, ARRIVAL_TIME, DEPARTURE_TIME, ARRIVAL_LOCALE, DEPARTURE_LOCALE, ARRIVAL_ZCTA, DEPARTURE_ZCTA, STAGE, MAP_STAY};
	
	public static enum SEIR {S, E, I, R};
	
	public static enum DT {YMD, HMS};	

	public static enum DATETIME {YR, MO, DA, HR, MI, SC};	

	public static final String DISEASE_TEXT = "disease-text";
	public static final String LOCALE_TEXT = "locale-text";
	public static final String OUTBREAK_TEXT = "outbreak-text";
	public static final String SCENARIO_TITLE = "scenario-title";
	public static final String SCENARIO_TEXT = "scenario-text";
	
	public static final String SCENARIO_BEGIN = "begin";
	public static final String SCENARIO_END = "end";
	public static final String SCENARIO_STEPSIZE = "stepSize";
	public static final String POPULATION = "population";
	public static final String CONTACT_RATE = "contactRate";
	public static final int TIME_STEP_KEY_LENGTH = 19;

	public static final String DATE_PRESENTATION_FORMAT = "E, MM/dd/yy' @ 'h a";
	public static final String DATE_FORMAT = "yyyy-MM-dd' 'HH:mm:ss";
	public static final String TABLE_DATE_FORMAT = "yyyy-MM-dd' 'HH";
	
	public static final int HOURS_IN_DAY = 24;
	public static final int MINUTES_IN_DAY = 1440;
	public static final String HEALTHY = "S";
	public static final String TOTAL_POPULATION = "T";
	
	public static final String SOURCEDATA_EXT = ".data";	
	public static final String Y0_PRIME_EXT = ".y0prime";
	
	public static final String HDFS_APPENDER = "-r-00000";
	public static final String EPISTATE_ROOT = "epistate";
	public static final String IOSTATE_ROOT = "iostate";
	public static final String TSV = ".tsv";
	public static final String EPISTATE_HDFS = EPISTATE_ROOT + HDFS_APPENDER;
	public static final String IOSTATE_HDFS = IOSTATE_ROOT + HDFS_APPENDER;
	
	public static final String CONFIGURATION_FILE = "conf.xmi";
	public static final String DEPARTURE_FILE = "departure.txt";
	public static final String DISEASE_FILE = "disease.xmi";
	public static final String EPISTATE_FILE = EPISTATE_ROOT + TSV;
	public static final String IOSTATE_FILE = IOSTATE_ROOT + TSV;
	public static final String LOCALES_FILE = "locales.xmi";
	public static final String OUTBREAKS_FILE = "outbreaks.xmi";
	public static final String SCENARIO_FILE = "scenario.xmi";
	public static final String TPSTATE_FILE = "tpstate.xmi";
	
	public static final String MAPRED_JVM_OPTS = "mapred.child.java.opts";
	
	public static boolean OMIT_ZERO_LENGTH = true;
}