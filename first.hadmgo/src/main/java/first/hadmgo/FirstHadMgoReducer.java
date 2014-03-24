package first.hadmgo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.log4j.Logger;
import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;

import com.mongodb.hadoop.io.MongoUpdateWritable;

public class FirstHadMgoReducer extends Reducer<Text, Text, NullWritable, MongoUpdateWritable> {

	private static final Logger log = Logger.getLogger(FirstHadMgoReducer.class);

	@Override
	protected void reduce(Text key, Iterable<Text> vals, Context ctx)
			throws IOException, InterruptedException {
		
		log.info("reduceing==>");

		
        BasicBSONObject query = new BasicBSONObject("_id", key.toString());
        List<ObjectId> cdas = new ArrayList<ObjectId>();
        for (Text val : vals) {
        	cdas.add(new ObjectId(val.toString()));
        }

        BasicBSONObject update = new BasicBSONObject("$pushAll", new BasicBSONObject("cdas", cdas));
        ctx.write(null, new MongoUpdateWritable(query, update, true, false));
	}
}