import lejos.robotics.SampleProvider;
import lejos.robotics.filter.AbstractFilter;

public class Ultrasonic extends AbstractFilter{

	float[] sample;
	public Ultrasonic(SampleProvider source) {
		super(source);
		// TODO Auto-generated constructor stub
		sample=new float[sampleSize];
		
	}

	public float distance(){
		super.fetchSample(sample, 0);
		return sample[0];
	}
}
