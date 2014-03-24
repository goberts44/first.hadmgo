package first.hadmgo;

import java.net.UnknownHostException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.ToolRunner;
import org.apache.log4j.Logger;

import com.mongodb.hadoop.MongoConfig;
import com.mongodb.hadoop.MongoInputFormat;
import com.mongodb.hadoop.MongoOutputFormat;
import com.mongodb.hadoop.io.BSONWritable;
import com.mongodb.hadoop.util.MongoTool;

public class FirstHadMgo extends MongoTool {

	private static final Logger log = Logger.getLogger(FirstHadMgo.class);

	public FirstHadMgo() throws UnknownHostException {
		super();
		Configuration cfg = new Configuration();
		cfg.addResource("firsthadmgo.xml");

		MongoConfig cfgMgo = new MongoConfig(cfg);
		cfgMgo.setInputFormat(MongoInputFormat.class);
		// port was :27017
		cfgMgo.setInputURI("mongodb://localhost/test.cda");
		cfgMgo.setOutputFormat(MongoOutputFormat.class);
		cfgMgo.setOutputURI("mongodb://localhost/test.patient");

		cfgMgo.setMapper(FirstHadMgoMapper.class);
		cfgMgo.setReducer(FirstHadMgoReducer.class);
		cfgMgo.setMapperOutputKey(Text.class);
		cfgMgo.setMapperOutputValue(Text.class);
		cfgMgo.setOutputKey(IntWritable.class);
		cfgMgo.setOutputValue(BSONWritable.class);
		setConf(cfg);
	}

//	public void run() {
//		Configuration cfg = new Configuration();
//		cfg.addResource("firsthadmgo.xml");
//
//		MongoConfig cfgMgo = new MongoConfig(cfg);
//		cfgMgo.setInputFormat(MongoInputFormat.class);
//		cfgMgo.setInputURI("mongodb://localhost:27017/test/cda/");
//		cfgMgo.setOutputFormat(MongoOutputFormat.class);
//		cfgMgo.setOutputURI("mongodb://localhost:27017/test/patient/");
//
//		cfgMgo.setMapper(FirstHadMgoMapper.class);
//		cfgMgo.setReducer(FirstHadMgoReducer.class);
//		cfgMgo.setMapperOutputKey(Text.class);
//		cfgMgo.setMapperOutputValue(Text.class);
//		cfgMgo.setOutputKey(IntWritable.class);
//		cfgMgo.setOutputValue(BSONWritable.class);
//	}

	public static void main(String[] args) throws Exception {
		System.exit(ToolRunner.run(new FirstHadMgo(), args));
	}
}