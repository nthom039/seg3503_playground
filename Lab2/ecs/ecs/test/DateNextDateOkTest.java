import java.time.Year;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{
    private Date dateIn;
    private Date expectedDate;

    /**
     * @param dateIn
     * @param expectedDate
     */
    
    public DateNextDateOkTest(Date dateIn, Date expectedDate){
        this.dateIn = dateIn;
        this.expectedDate = expectedDate;
    }

    @Parameters
	public static List<Date[]> data( )
	{
		List<Date[]> params = new LinkedList<Date[]>( );
		params.add(new Date[] { new Date(2022,01,01), new Date(2022,01,02) });
		params.add(new Date[] { new Date(2024,02,28), new Date(2022,02,29) });
		params.add(new Date[] { new Date(2023,02,28), new Date(2023,03,01) });
		params.add(new Date[] { new Date(2022,12,31), new Date(2023,01,01) });
		params.add(new Date[] { new Date(0001,01,01), new Date(0001,01,02) });
		return params;
	}

    @Test
	public void testAnd()
	{
		Date newDateTest = dateIn.nextDate();
		Assert.assertEquals(expectedDate, newDateTest);
	}
}