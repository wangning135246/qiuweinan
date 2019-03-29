$(document).ready(function() {

    selectOpLogList();

});

function selectOpLogList(){
    $.ajax({
        url : '/disease/selectDoctorAndResident',
        type : 'post',
        cache : false,
        dataType : 'json',
        success : function(data) {

            if (data != null  ) {

                var myChart = echarts.init(document.getElementById('importMain'));
                var dateList = data.dateListResident;
                var dateList1 = data.dateListDoctor;
                var valueList = data.valueListResident;
                var valueList1 = data.valueListDoctor;

                option = {

                    // Make gradient line here
                    visualMap: [{
                        show: false,
                        type: 'continuous',
                        seriesIndex: 0,
                        min: 0,
                        max: 400
                    }, {
                        show: false,
                        type: 'continuous',
                        seriesIndex: 1,
                        dimension: 0,
                        min: 0,
                        max: dateList.length - 1
                    }],


                    title: [{
                        left: 'center',
                        text: '各站点医生分配情况'
                    }, {
                        top: '55%',
                        left: 'center',
                        text: '各医生居民分配情况'
                    }],
                    tooltip: {
                        trigger: 'axis'
                    },
                    xAxis: [{
                        data: dateList
                    }, {
                        data: dateList1,
                        gridIndex: 1
                    }],
                    yAxis: [{
                        splitLine: {show: false}
                    }, {
                        splitLine: {show: false},
                        gridIndex: 1
                    }],
                    grid: [{
                        bottom: '60%'
                    }, {
                        top: '60%'
                    }],
                    series: [{
                        type: 'line',
                        showSymbol: false,
                        data: valueList
                    }, {
                        type: 'line',
                        showSymbol: false,
                        data: valueList1,
                        xAxisIndex: 1,
                        yAxisIndex: 1
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
            }else{$('#importMain').html('无数据')}
        },

    });
}