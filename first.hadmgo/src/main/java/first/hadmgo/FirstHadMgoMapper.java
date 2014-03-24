package first.hadmgo;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.log4j.Logger;
import org.bson.BSONObject;

public class FirstHadMgoMapper extends Mapper<Object, BSONObject, Text, Text> {

	private static final Logger log = Logger.getLogger(FirstHadMgoMapper.class);

	@Override
	protected void map(Object key, BSONObject val, Context ctx) throws IOException,
			InterruptedException {
		
		log.info("mapping==>");
		
		String keyOut = (String)val.get("patientId");
		
		ctx.write(new Text(keyOut), new Text(val.get("_id").toString()));
	}
}