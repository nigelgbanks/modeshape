package org.modeshape.jmx;

import java.beans.ConstructorProperties;
import java.util.List;

/**
 * Value holder for the JXM-exposed information based on {@link org.modeshape.jcr.api.monitor.History} instances.
 *
 * @author Horia Chiorean (hchiorea@redhat.com)
 */
public class HistoricalData {

    private final String timeWindow;
    private final String start;
    private final String end;
    private final List<StatisticalData> statisticalData;

    /**
     * @param timeWindow the name of the time windows for which the data is produced.
     * @param start the ISO-8601 format of the start time
     * @param end the ISO-8601 format of the end time
     * @param statisticalData a list of {@link StatisticalData} for the interval
     */
    @ConstructorProperties({"timeWindow", "start", "end", "statisticalData"})
    public HistoricalData( String timeWindow,
                           String start,
                           String end,
                           List<StatisticalData> statisticalData ) {
        this.timeWindow = timeWindow;
        this.start = start;
        this.end = end;
        this.statisticalData = statisticalData;
    }

    /**
     * @return the name of the time windows for which the data is produced.
     */
    public String getTimeWindow() {
        return timeWindow;
    }

    /**
     * @return the ISO-8601 format of the start time
     */
    public String getStart() {
        return start;
    }

    /**
     * @return the ISO-8601 format of the end time
     */
    public String getEnd() {
        return end;
    }

    /**
     * @return the list of {@link StatisticalData} which make up this data; never null but possibly empty.
     */
    public List<StatisticalData> getStatisticalData() {
        return statisticalData;
    }
}