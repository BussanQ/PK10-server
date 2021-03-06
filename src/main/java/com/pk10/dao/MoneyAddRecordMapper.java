package com.pk10.dao;

import com.pk10.bean.MoneyAddRecord;
import com.pk10.bean.MoneyAddRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoneyAddRecordMapper {
    int countByExample(MoneyAddRecordExample example);

    int deleteByExample(MoneyAddRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MoneyAddRecord record);

    int insertSelective(MoneyAddRecord record);

    List<MoneyAddRecord> selectByExample(MoneyAddRecordExample example);

    MoneyAddRecord selectByPrimaryKey(Integer id);

    List<MoneyAddRecord> selectByUserId(Integer id);

    int updateByExampleSelective(@Param("record") MoneyAddRecord record, @Param("example") MoneyAddRecordExample example);

    int updateByExample(@Param("record") MoneyAddRecord record, @Param("example") MoneyAddRecordExample example);

    int updateByPrimaryKeySelective(MoneyAddRecord record);

    int updateByPrimaryKey(MoneyAddRecord record);

    List<MoneyAddRecord> selectAll();

    List<MoneyAddRecord> getMoneyAddRecordList(@Param("curUserId") Integer curUserId, @Param("startTime") String startTime,
                                               @Param("endTime") String endTime);

    List<MoneyAddRecord> findByTimeBetween(@Param("startTime") String startTime,
                                           @Param("endTime") String endTime);

    List<MoneyAddRecord> findByIdAndTime(@Param("userId") Integer userId,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime);

    List<MoneyAddRecord> findByAgentIdAndTime(@Param("curAgentId") Integer curAgentId,
                                              @Param("startTime") String startTime,
                                              @Param("endTime") String endTime);
}