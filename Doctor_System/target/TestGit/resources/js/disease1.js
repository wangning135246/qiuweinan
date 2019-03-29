$(document).ready(function() {

    selectOpLogList();

});

function selectOpLogList(){
    $.ajax({
        url : '/disease/selectDisease',
        type : 'post',
        cache : false,
        dataType : 'json',
        success : function(data) {

            if (data != null  ) {

                var myChart = echarts.init(document.getElementById('importMain'));
                var dateList = data.dateList;
                var valueList = data.valueList;

                option = {
                    title: [{
                        left: 'center',
                        text: '病情分析情况'
                    }],
                    xAxis: {
                        type: 'category',
                        data: dateList
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: valueList,
                        type: 'line'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);

            }else{$('#importMain').html('无数据')}
        },

    });
}