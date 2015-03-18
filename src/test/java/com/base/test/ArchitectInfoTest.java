package com.base.test;

import com.base.dao.ArchitectInfoMapper;
import com.base.dao.ArchitectMapper;
import com.base.dto.ArchitectDto;
import com.base.dto.ArchitectInfoDto;
import com.base.dto.ProjectType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by zhoutaotao on 3/16/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-applicationContext-dao.xml")
@Ignore
public class ArchitectInfoTest {
    @Autowired
    private ArchitectInfoMapper architectInfoMapper;
    @Autowired
    private ArchitectMapper architectMapper;

    @Test
    public void testSave(){
        ArchitectInfoDto architectInfoDto = new ArchitectInfoDto();

        ArchitectDto dto =architectMapper.queryByName("01dtfd");
        dto.setTitle("运河之门“洞天福地”-淮安世界运河文化旅游区");
        dto.setStatus(ProjectType.jgsj.toString());
        architectMapper.update(dto);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("运河之门“洞天福地”-淮安世界运河文化旅游区<br>项目位于江苏淮安，在运河文化广场上，来此游玩的游客可以在此透过洞天之门框景出运河之宫、淮安电视塔及整个山阳湖美景，与美景遥遥相望、别有洞天。");
        architectInfoDto.setDesc2("本设计包含两个部分，一部分是“洞天”，一部分是“福地”，合为“洞天福地”。“洞天”设计成高耸入云的大山，代表历史悠久的淮安文化；如今的淮安，是一座美丽清纯的魅力城市，我们称为“漂浮在水上的城市”，因此，用水中挺立的大山来赞美淮安特殊的水文化。");
        architectInfoDto.setDesc3("采用不锈钢表面的设计，金属质感的“洞天”有如未来之物，世界运河文化旅游区包含了世界各大运河城市特点，来自东西方的运河城市缩影共同打造了现实版的运河清明上河图，这些城市缩影共同映照在“洞天”那光滑高亮的表面上，表现了淮安传承历史,面向未来的新淮安精神。");
        architectInfoMapper.save(architectInfoDto);


        dto =architectMapper.queryByName("02xhjrjy");
        dto.setTitle("新汇基软件园规划设计");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("新汇基软件科技产业园规划设计<br>项目地点：河南省洛阳市伊川县高新技术园区");
        architectInfoDto.setDesc2("用地面积：685920平方米<br>建筑面积：1270000平方米");
        architectInfoDto.setDesc3("设计思路：项目主要功能包括人才实训基地、软件科技园、生活配套区。新汇基软件科技产业园以计算机软件企业为核心，采取产、学、研相结合的模式，构建一个设施完善、环境和谐的软件实训与应用基地，是一个集合高新技术自主研发、高科技人才培养于一体的科技创新园区。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("03bjshzyglxy");
        dto.setTitle("北京社会职业管理学院");
        dto.setStatus(ProjectType.whjy.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("北京社会职业管理学院<br>项目地点：北京<br>用地面积：397600平方米<br>建筑面积：154800平方米");
        architectInfoDto.setDesc2("设计思路：地处北京的地理特点，五千年文明的文化传承，自然平坦的地貌特征以及日益迫切的社会需求，成为了设计理念的脉络根基。");
        architectInfoDto.setDesc3("新校区的原创形态则为以文化为底蕴，以功能为核心，以轴线为重点，方圆有秩，南北呼应。同时受边界、河流影响引入自然导向构图，以此形成成个校园的规划结构，形成了张与驰、疏与密、刚与柔并存，形式与空间相呼应的统一体，产生了校园的形式感与场所感。");
        architectInfoMapper.save(architectInfoDto);


        dto =architectMapper.queryByName("04hnsswhlyjd");
        dto.setTitle("润泽东方文化城一期规划设计方案");
        dto.setStatus(ProjectType.zydc.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("润泽东方文化城一期规划设计方案<br>项目地点：湖南韶山");
        architectInfoDto.setDesc2("用地面积：268700平方米<br/>建筑面积：87066平方米");
        architectInfoDto.setDesc3("设计思路：“聚落”，古代指村落，中国的《汉书·沟洫志》的记载：“或久无害，稍筑室宅，遂成聚落”。聚落是人类聚居和生活的场所，是人类有意识开发利用和改造自然而创造出来的生存环境。<br>本项目以“聚落空间”为基本设计理念，希望表达人与自然和谐相处，回归自然，体验自然，“天人合一”的中国传统文化意境");
        architectInfoMapper.save(architectInfoDto);


        dto =architectMapper.queryByName("05jyfdeq");
        dto.setTitle("京燕饭店二期");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("北京京燕饭店二期概念设计<br>项目地点：北京");
        architectInfoDto.setDesc2("用地面积：13000平方米<br>建筑面积：101500平方米");
        architectInfoDto.setDesc3("设计思路：天圆地方-城的概念：用比例和尺度表达几何的完美，从来就是用来表达一些重要场所的精神最高品质的方法。京燕商务区由现有饭店部分和将来开发四栋单体共同为合成方形广场，其中由下沉数字影院构成圆形中心。在围合的同时，共同构成传统意义上的城的概念。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("06jllcjdsxm");
        dto.setTitle("吉林龙城帝景住宅项目");
        dto.setStatus(ProjectType.jzgh.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("吉林龙城帝景住宅项目<br>项目地点：吉林");
        architectInfoDto.setDesc2("用地面积：284500平方米<br>建筑面积：834700平方米");
        architectInfoDto.setDesc3("设计思路：本项目通过合理功能布局，以现代风格的建筑立面建设崭新的城市形象，力图打造以居住为主，商业、文化为辅，突出城市风貌特色，创造形态、低碳的宜居居住空间。同时在建筑形象上保持线性街道的完整性，并形成节点景观、美化城市天际线。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("07jnhdzzq");
        dto.setTitle("济宁豪德毅德·首誉住宅项目");
        dto.setStatus(ProjectType.jzgh.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("济宁豪德毅徳·首誉住宅项目<br>项目地点：山东济宁");
        architectInfoDto.setDesc2("用地面积：369000平方米<br>建筑面积：912000平方米");
        architectInfoDto.setDesc3("设计思路：合理利用环境优势，本项目用地东侧为绵延的京杭大运河，区域的建筑环境较好，一种城市区域建筑必然是共性和特性潜质并存，共性决定与城市规划的功能性和秩序性，特性则可创造城市的生命活力。");
        architectInfoMapper.save(architectInfoDto);


        dto =architectMapper.queryByName("08xcyy");
        dto.setTitle("西昌医院方案设计");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("西昌医院方案设计<br>项目地点：四川西昌");
        architectInfoDto.setDesc2("用地面积：137000平方米<br>建筑面积：173500平方米");
        architectInfoDto.setDesc3("设计思路：医疗建筑设计的首要原则是清晰与简洁。建筑的标志性不仅仅在于建筑的物质属性，而更在于它的精神属性。本方案以“矩阵空间”为基本设计理念和主题，以方正、严谨、模数化的“矩阵空间”将多维度的设计元素有机整合，创造出一个简约时尚而又寓意深刻的标志性建筑。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("09mzaxy");
        dto.setTitle("铭真爱心园生态旅游项目概念规划设计");
        dto.setStatus(ProjectType.zydc.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("铭真爱心苑生态旅游项目概念规划设计<br>项目地点：云南昆明");
        architectInfoDto.setDesc2("用地面积：184950平方米<br>建筑面积：63347平方米");
        architectInfoDto.setDesc3("设计思路：以医疗产业为核心，建设医疗产业园、爱心阁、铭真谷、文化商业中心和旅游度假村五大功能区；各功能区完整、独立，却又和谐共生。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("10wlmqtljz");
        dto.setTitle("乌鲁木齐铁路局站");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("乌鲁木齐铁路局站<br>项目地点：新疆乌鲁木齐");
        architectInfoDto.setDesc2("用地面积：53200平方米<br>建筑面积：376600平方米");
        architectInfoDto.setDesc3("设计思路：乌鲁木齐轨道1号线是南北向骨干线路，沟通老城区、新市区和主要对外交通枢纽，规划片区处于乌市城区西北部，新市区的核心区，规划设计用地位于两条城市主干路的交叉口，铁路局站为轨道1、4号线换乘枢纽，交通便利、优势显著。 ");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("11hcjysq");
        dto.setTitle("皇城家园三期住宅项目");
        dto.setStatus(ProjectType.jzgh.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("皇城家园三期住宅项目<br>项目地点：河北张家口");
        architectInfoDto.setDesc2("用地面积：50127平方米<br>建筑面积：157111平方米");
        architectInfoDto.setDesc3("设计思路：本项目位于宣化古镇中心位置，社区形象的塑造充分体现城市核心地段的尊贵气度。以多种户型定位共同围绕中心景观、绿化广场喷泉布置，有助于社区认同感的形成，并具有强烈的可识别性。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("12wlmqblz");
        dto.setTitle("乌鲁木齐八楼站");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("乌鲁木齐铁八楼站<br>项目地点：新疆乌鲁木齐");
        architectInfoDto.setDesc2("用地面积：28000平方米<br>建筑面积：151700平方米");
        architectInfoDto.setDesc3("设计思路：八楼站位于乌鲁木齐市新市区与沙依巴克区交界处，即位于新老城区的过渡区域。根据对用地范围内及周边会议会展与酒店商业等功能分析,综合考虑片区发展需求导向,对该片区提出功能完善,业态提升及规模发展的要求,综合市场导向需求,该规划用地内主导功能定位为星级酒店及高端商务办公；并辅助以精品商业,高档餐饮,精品展廊等功能。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("13bahy");
        dto.setTitle("北岸花园住宅项目");
        dto.setStatus(ProjectType.jzgh.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("北岸花园住宅项目<br>项目地点：河北张家口");
        architectInfoDto.setDesc2("用地面积：58942平方米<br>建筑面积：130400平方米");
        architectInfoDto.setDesc3("设计思路：本项目位于宣化古镇，紧邻古城墙遗址，本着尊重文化古迹的设计理念，立面采用中式风格，融合城市历史文脉同时，创造美好、温馨的居住环境。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("14wlmqjnmz");
        dto.setTitle("乌鲁木齐南门站");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("乌鲁木齐铁南门站<br>项目地点：新疆乌鲁木齐");
        architectInfoDto.setDesc2("用地面积：60500平方米<br>建筑面积：346200平方米");
        architectInfoDto.setDesc3("设计思路：规划区内公共配套设施以商务办公及零售商业最主，是主要银行总部所在地，政务办公较其他区域集中，是新疆维吾尔自治区政府及乌鲁木齐天山区政府所在片区。另外，该区交通条件良好，适宜利用优势资源强化该区特色。");
        architectInfoMapper.save(architectInfoDto);

        dto =architectMapper.queryByName("15hplybgl");
        dto.setTitle("和平铝业办公楼");
        dto.setStatus(ProjectType.sybg.toString());
        architectMapper.update(dto);
        architectInfoDto.setId(null);
        architectInfoDto.setArchitectId(dto.getId());
        architectInfoDto.setCreateDate(new Date());
        architectInfoDto.setDesc1("和平铝业办公楼<br>项目地点：北京东潮白河");
        architectInfoDto.setDesc2("用地面积：5500平方米<br>建筑面积：5700平方米");
        architectInfoDto.setDesc3("设计思路：采用玻璃与钢作为材料，结合中国传统园林的设计手法，体现中国本土企业的发展精神。");
        architectInfoMapper.save(architectInfoDto);
    }

}
