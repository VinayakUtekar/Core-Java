class RAWAgent
{
	private int RawAgentBatchId;
	private String RawAgentCodeName;
	private String RawAgentMissionName;

	RAWAgent(int RawAgentBatchId, String RawAgentCodeName, String RawAgentMissionName)
	{
		this.RawAgentBatchId = RawAgentBatchId;
		this.RawAgentCodeName = RawAgentCodeName;
		this.RawAgentMissionName = RawAgentMissionName;
	}

	public int getRawAgentBatchId()
	{
		return RawAgentBatchId;
	}

	public String getRawAgentCodeName()
	{
		return RawAgentCodeName;
	}

	public String getRawAgentMissionName()
	{
		return RawAgentMissionName;
	}

	public void setRawAgentBatchId(int RawAgentBatchId)
	{ 
		this.RawAgentBatchId = RawAgentBatchId;
	}

	public void setRawAgentCodeName(String RawAgentCodeName)
	{ 
		this.RawAgentCodeName = RawAgentCodeName();
	}

	public void setRawAgentMissionName(String RawAgentMissionName)
	{ 
		this.RawAgentMissionName = RawAgentMissionName;
	}
}

public class IndianSecretUnit
{
	RAWAgent a;
	
	public void data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------->");
		System.out.println("Enter Agent Id : ");
		int id = sc.nextInt(); sc.nextLine();
		System.out.println("Enter Agent Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Mission Name : ");
		String mission = sc.nextLine();
		a = new RAWAgent(id, name, mission);
	}

	public void details()
	{
		System.out.println("########################################################");
		System.out.println("Agent Id : " + e.getRawAgentBatchId());
		System.out.println("Agent Name : " + e.RawAgentCodeName());
		System.out.println("Agent Mission : " + e.getRawAgentMissionName());
	}

	public static void main(String[] args) 
	{
		//Agent 1
		IndianSecretUnit ref1 = new IndianSecretUnit();
		ref1.data();
		ref1.details();

	}
}