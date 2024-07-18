<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class CommitTxnRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'txnid',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'replPolicy',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'writeEventInfos',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WriteEventInfo',
                ),
        ),
        4 => array(
            'var' => 'replLastIdInfo',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\ReplLastIdInfo',
        ),
        5 => array(
            'var' => 'keyValue',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\CommitTxnKeyValue',
        ),
        6 => array(
            'var' => 'exclWriteEnabled',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        7 => array(
            'var' => 'txn_type',
            'isRequired' => false,
            'type' => TType::I32,
            'class' => '\metastore\TxnType',
        ),
    );

    /**
     * @var int
     */
    public $txnid = null;
    /**
     * @var string
     */
    public $replPolicy = null;
    /**
     * @var \metastore\WriteEventInfo[]
     */
    public $writeEventInfos = null;
    /**
     * @var \metastore\ReplLastIdInfo
     */
    public $replLastIdInfo = null;
    /**
     * @var \metastore\CommitTxnKeyValue
     */
    public $keyValue = null;
    /**
     * @var bool
     */
    public $exclWriteEnabled = true;
    /**
     * @var int
     */
    public $txn_type = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['txnid'])) {
                $this->txnid = $vals['txnid'];
            }
            if (isset($vals['replPolicy'])) {
                $this->replPolicy = $vals['replPolicy'];
            }
            if (isset($vals['writeEventInfos'])) {
                $this->writeEventInfos = $vals['writeEventInfos'];
            }
            if (isset($vals['replLastIdInfo'])) {
                $this->replLastIdInfo = $vals['replLastIdInfo'];
            }
            if (isset($vals['keyValue'])) {
                $this->keyValue = $vals['keyValue'];
            }
            if (isset($vals['exclWriteEnabled'])) {
                $this->exclWriteEnabled = $vals['exclWriteEnabled'];
            }
            if (isset($vals['txn_type'])) {
                $this->txn_type = $vals['txn_type'];
            }
        }
    }

    public function getName()
    {
        return 'CommitTxnRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->txnid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->replPolicy);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->writeEventInfos = array();
                        $_size723 = 0;
                        $_etype726 = 0;
                        $xfer += $input->readListBegin($_etype726, $_size723);
                        for ($_i727 = 0; $_i727 < $_size723; ++$_i727) {
                            $elem728 = null;
                            $elem728 = new \metastore\WriteEventInfo();
                            $xfer += $elem728->read($input);
                            $this->writeEventInfos []= $elem728;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->replLastIdInfo = new \metastore\ReplLastIdInfo();
                        $xfer += $this->replLastIdInfo->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRUCT) {
                        $this->keyValue = new \metastore\CommitTxnKeyValue();
                        $xfer += $this->keyValue->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->exclWriteEnabled);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->txn_type);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('CommitTxnRequest');
        if ($this->txnid !== null) {
            $xfer += $output->writeFieldBegin('txnid', TType::I64, 1);
            $xfer += $output->writeI64($this->txnid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->replPolicy !== null) {
            $xfer += $output->writeFieldBegin('replPolicy', TType::STRING, 2);
            $xfer += $output->writeString($this->replPolicy);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->writeEventInfos !== null) {
            if (!is_array($this->writeEventInfos)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('writeEventInfos', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->writeEventInfos));
            foreach ($this->writeEventInfos as $iter729) {
                $xfer += $iter729->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->replLastIdInfo !== null) {
            if (!is_object($this->replLastIdInfo)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('replLastIdInfo', TType::STRUCT, 4);
            $xfer += $this->replLastIdInfo->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->keyValue !== null) {
            if (!is_object($this->keyValue)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('keyValue', TType::STRUCT, 5);
            $xfer += $this->keyValue->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->exclWriteEnabled !== null) {
            $xfer += $output->writeFieldBegin('exclWriteEnabled', TType::BOOL, 6);
            $xfer += $output->writeBool($this->exclWriteEnabled);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->txn_type !== null) {
            $xfer += $output->writeFieldBegin('txn_type', TType::I32, 7);
            $xfer += $output->writeI32($this->txn_type);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
