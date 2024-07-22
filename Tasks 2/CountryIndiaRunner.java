class CountryIndiaRunner

{
	public static void main (String [] args)
	{
		System.out.println("Running main in CountryRunner");
		String [] references={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujrat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
		CountryIndia.states(references);
		System.out.println("----------------------------------------------------------------------------------------------");
		
		int [] codeRefs={560001,577401,577412,577482,564301,548236,570001,571045,564230,589210};
		CountryIndia.pincode(codeRefs);
		System.out.println("----------------------------------------------------------------------------------------------");

		
		String [] primeMinisterName={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahaddur Shastry","Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P V Narasimha Rao","Atal Bihari Vajpayee","H D Devegowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
		CountryIndia.primeMinister(primeMinisterName);
		System.out.println("----------------------------------------------------------------------------------------------");

		
		String [] cabinetMinisterName={"Shri Narendra Modi ","Shri Raj Nath Singh","Shri Amit Shah ","Shri Nitin Jairam Gadkari ","Smt. Nirmala Sitharaman ","Shri Narendra Singh Tomar","Dr. Subrahmanyam Jaishankar","Shri Arjun Munda","Smt. Smriti Zubin Irani","Shri Piyush Goyal ","Shri Dharmendra Pradhan","Shri Pralhad Joshi","Shri Narayan Tatu Rane","Shri Sarbananda Sonowal ","Dr. Virendra Kumar","Shri Giriraj Singh","Shri Jyotiraditya M. Scindia ","Shri Ashwini Vaishnaw","Shri Pashu Pati Kumar Para","Shri Gajendra Singh Shekhawat","Shri Kiren Rijiju ","Shri Raj Kumar Singh","Shri Hardeep Singh Puri ","Dr. Mansukh Mandaviya","Shri Bhupender Yadav","Dr. Mahendra Nath Pandey ","Shri Parshottam Rupala","Shri G. Kishan Reddy","Shri Anurag Singh Thakur"};
		CountryIndia.cabinetMinister(cabinetMinisterName);
		System.out.println("----------------------------------------------------------------------------------------------");

		
		String [] partiesName={"Bhartiya Janata Party","Indian National Congress","Aam Admi Party","Bahujan Samaj Party","National People's Party"};
		CountryIndia.parties(partiesName);
		
	}
	
}