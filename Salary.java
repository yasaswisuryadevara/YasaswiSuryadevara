package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
		@Value(value= "50000")
		private double basic;
		@Value(value = "40000")
		private double hra;
		public double getBasic() {
			return basic;
		}
		public void setBasic(double basic) {
			this.basic = basic;
		}
		public double getHra() {
			return hra;
		}
		public void setHra(double hra) {
			this.hra = hra;
		}
		
		
			

		

	}

